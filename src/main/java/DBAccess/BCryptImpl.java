/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

/**
 * This in an implementation of BCrypt so it's more easy for us to use.
 *
 * @author Temporalis
 */
public class BCryptImpl {

    private final int logRounds;
    //I have read that 10 is the default. This number is the work factor. 
    //The larger the number the longer it will take. 
    //This is adjustable so we can make the hashing slower once CPUs get better

    public BCryptImpl(int logRounds) {
        this.logRounds = logRounds;
    }

    public String hash(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt(logRounds));
    }

    public boolean verifyHash(String password, String hash) {
        return BCrypt.checkpw(password, hash);
    }
}
