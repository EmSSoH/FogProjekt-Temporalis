/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

/**
 *
 * @author Juste
 */
public class Stykliste {
    private int id, TrykimpBrædt25x200mm360, TrykimpBrædt25x200mm540,trykimpbrædt25x125mm360,trykimpbrædt25x125mm540,lægteubh38x73mm420,regulærub45x95mm270,regulærub45x95mm240,
            regulærub45x95mm360,spærtræubh45x195mm600,spærtræubh45x195mm480,trykimpstolpe97x97mm300,trykimpbrædt19x100mm210,trykimpbrædt19x100mm540,trykimpbrædt19x100mm360,
            trykimpbrædt19x100mm480,trykimpbrædt19x100mm240,trykimpbrædt25x150mm480,trykimpbrædt25x150mm600,trykimpbrædt25x150mm540,færdigskåret,trykimpbræt25x50mm540,
            taglægteTI38x73mm540,taglægteTI38x73mm420, BCdobbeltssort, BCrygstensort, BCtoplægterholder, BCrygstensbeslag, BCtagstensbindereognakkekroge,Plastmoecoliteblåtonet600,
            Plastmoecoliteblåtonet360,Plastmobundskruer50stk, Hulbånd1x20mm10mtr, Universal190mmhøjre, Universal190mmvenstre, skruer4komma5x60mm50stk, beslagskruer4x50mm50stk, Bræddebolt10x120mm,
            Firkantsskiver40x40x11mm,skruer4komma5x70mm50stk, skruer4komma5x50mm50stk, Stalddørsgreb50x75,Thængsel390mm,Vinkelbeslag35,beslagskruer5x40mm50stk,skruer5x100mm50stk;

    //calculator without shed
    public Stykliste(int width, int length){
        calculate(width,length);
    }
    
    //calculator with shed
    public Stykliste(int width, int length, int swidth, int slength){
        
    }
    
    
    //faldt tag uden skur
    public Stykliste(int id, int TrykimpBrædt25x200mm360,int TrykimpBrædt25x200mm540,int trykimpbrædt25x125mm360,int trykimpbrædt25x125mm540,int lægteubh38x73mm420,int regulærub45x95mm270,int regulærub45x95mm240
    ,int spærtræubh45x195mm600,int trykimpstolpe97x97mm300,int trykimpbrædt19x100mm540,int trykimpbrædt19x100mm360,int Plastmoecoliteblåtonet600,
            int Plastmoecoliteblåtonet360,int Plastmobundskruer50stk, int Hulbånd1x20mm10mtr, int Universal190mmhøjre,int Universal190mmvenstre, int skruer4komma5x60mm50stk, int beslagskruer4x50mm50stk,int Bræddebolt10x120mm,
            int Firkantsskiver40x40x11mm){

            this.id = id;
            this.TrykimpBrædt25x200mm360 = TrykimpBrædt25x200mm360;
            this.TrykimpBrædt25x200mm540 = TrykimpBrædt25x200mm540;
            this.trykimpbrædt25x125mm360 = trykimpbrædt25x125mm360;
            this.trykimpbrædt25x125mm540 = trykimpbrædt25x125mm540;
            this.lægteubh38x73mm420 =lægteubh38x73mm420;
            this.regulærub45x95mm270 = regulærub45x95mm270;
            this.regulærub45x95mm240 = regulærub45x95mm240;
            this.spærtræubh45x195mm600 = spærtræubh45x195mm600;
            this.trykimpstolpe97x97mm300 = trykimpstolpe97x97mm300;
            this.trykimpbrædt19x100mm540 = trykimpbrædt19x100mm540;
            this.trykimpbrædt19x100mm360 = trykimpbrædt19x100mm360;
            this.Plastmoecoliteblåtonet600 = Plastmoecoliteblåtonet600;
            this.Plastmoecoliteblåtonet360 = Plastmoecoliteblåtonet360;
            this.Plastmobundskruer50stk = Plastmobundskruer50stk;
            this.Hulbånd1x20mm10mtr = Hulbånd1x20mm10mtr;
            this.Universal190mmhøjre = Universal190mmhøjre;
            this.Universal190mmvenstre = Universal190mmvenstre;
            this.skruer4komma5x60mm50stk = skruer4komma5x60mm50stk;
            this.beslagskruer4x50mm50stk = beslagskruer4x50mm50stk;
            this.Bræddebolt10x120mm = Bræddebolt10x120mm;
            this.Firkantsskiver40x40x11mm = Firkantsskiver40x40x11mm;
            
    }
    
   

    public void setId(int id) {
        this.id = id;
    }

    public void setTrykimpBrædt25x200mm360(int TrykimpBrædt25x200mm360) {
        this.TrykimpBrædt25x200mm360 = TrykimpBrædt25x200mm360;
    }

    public void setTrykimpBrædt25x200mm540(int TrykimpBrædt25x200mm540) {
        this.TrykimpBrædt25x200mm540 = TrykimpBrædt25x200mm540;
    }

    public void setTrykimpbrædt25x125mm360(int trykimpbrædt25x125mm360) {
        this.trykimpbrædt25x125mm360 = trykimpbrædt25x125mm360;
    }

    public void setTrykimpbrædt25x125mm540(int trykimpbrædt25x125mm540) {
        this.trykimpbrædt25x125mm540 = trykimpbrædt25x125mm540;
    }

    public void setLægteubh38x73mm420(int lægteubh38x73mm420) {
        this.lægteubh38x73mm420 = lægteubh38x73mm420;
    }

    public void setRegulærub45x95mm270(int regulærub45x95mm270) {
        this.regulærub45x95mm270 = regulærub45x95mm270;
    }

    public void setRegulærub45x95mm240(int regulærub45x95mm240) {
        this.regulærub45x95mm240 = regulærub45x95mm240;
    }

    public void setRegulærub45x95mm360(int regulærub45x95mm360) {
        this.regulærub45x95mm360 = regulærub45x95mm360;
    }

    public void setSpærtræubh45x195mm600(int spærtræubh45x195mm600) {
        this.spærtræubh45x195mm600 = spærtræubh45x195mm600;
    }

    public void setSpærtræubh45x195mm480(int spærtræubh45x195mm480) {
        this.spærtræubh45x195mm480 = spærtræubh45x195mm480;
    }

    public void setTrykimpstolpe97x97mm300(int trykimpstolpe97x97mm300) {
        this.trykimpstolpe97x97mm300 = trykimpstolpe97x97mm300;
    }

    public void setTrykimpbrædt19x100mm210(int trykimpbrædt19x100mm210) {
        this.trykimpbrædt19x100mm210 = trykimpbrædt19x100mm210;
    }

    public void setTrykimpbrædt19x100mm540(int trykimpbrædt19x100mm540) {
        this.trykimpbrædt19x100mm540 = trykimpbrædt19x100mm540;
    }

    public void setTrykimpbrædt19x100mm360(int trykimpbrædt19x100mm360) {
        this.trykimpbrædt19x100mm360 = trykimpbrædt19x100mm360;
    }

    public void setTrykimpbrædt19x100mm480(int trykimpbrædt19x100mm480) {
        this.trykimpbrædt19x100mm480 = trykimpbrædt19x100mm480;
    }

    public void setTrykimpbrædt19x100mm240(int trykimpbrædt19x100mm240) {
        this.trykimpbrædt19x100mm240 = trykimpbrædt19x100mm240;
    }

    public void setTrykimpbrædt25x150mm480(int trykimpbrædt25x150mm480) {
        this.trykimpbrædt25x150mm480 = trykimpbrædt25x150mm480;
    }

    public void setTrykimpbrædt25x150mm600(int trykimpbrædt25x150mm600) {
        this.trykimpbrædt25x150mm600 = trykimpbrædt25x150mm600;
    }

    public void setTrykimpbrædt25x150mm540(int trykimpbrædt25x150mm540) {
        this.trykimpbrædt25x150mm540 = trykimpbrædt25x150mm540;
    }

    public void setFærdigskåret(int færdigskåret) {
        this.færdigskåret = færdigskåret;
    }

    public void setTrykimpbræt25x50mm540(int trykimpbræt25x50mm540) {
        this.trykimpbræt25x50mm540 = trykimpbræt25x50mm540;
    }

    public void setTaglægteTI38x73mm540(int taglægteTI38x73mm540) {
        this.taglægteTI38x73mm540 = taglægteTI38x73mm540;
    }

    public void setTaglægteTI38x73mm420(int taglægteTI38x73mm420) {
        this.taglægteTI38x73mm420 = taglægteTI38x73mm420;
    }

    public void setBCdobbeltssort(int BCdobbeltssort) {
        this.BCdobbeltssort = BCdobbeltssort;
    }

    public void setBCrygstensort(int BCrygstensort) {
        this.BCrygstensort = BCrygstensort;
    }

    public void setBCtoplægterholder(int BCtoplægterholder) {
        this.BCtoplægterholder = BCtoplægterholder;
    }

    public void setBCrygstensbeslag(int BCrygstensbeslag) {
        this.BCrygstensbeslag = BCrygstensbeslag;
    }

    public void setBCtagstensbindereognakkekroge(int BCtagstensbindereognakkekroge) {
        this.BCtagstensbindereognakkekroge = BCtagstensbindereognakkekroge;
    }

    public void setPlastmoecoliteblåtonet600(int Plastmoecoliteblåtonet600) {
        this.Plastmoecoliteblåtonet600 = Plastmoecoliteblåtonet600;
    }

    public void setPlastmoecoliteblåtonet360(int Plastmoecoliteblåtonet360) {
        this.Plastmoecoliteblåtonet360 = Plastmoecoliteblåtonet360;
    }

    public void setPlastmobundskruer50stk(int Plastmobundskruer50stk) {
        this.Plastmobundskruer50stk = Plastmobundskruer50stk;
    }

    public void setHulbånd1x20mm10mtr(int Hulbånd1x20mm10mtr) {
        this.Hulbånd1x20mm10mtr = Hulbånd1x20mm10mtr;
    }

    public void setUniversal190mmhøjre(int Universal190mmhøjre) {
        this.Universal190mmhøjre = Universal190mmhøjre;
    }

    public void setUniversal190mmvenstre(int Universal190mmvenstre) {
        this.Universal190mmvenstre = Universal190mmvenstre;
    }

    public void setSkruer4komma5x60mm50stk(int skruer4komma5x60mm50stk) {
        this.skruer4komma5x60mm50stk = skruer4komma5x60mm50stk;
    }

    public void setBeslagskruer4x50mm50stk(int beslagskruer4x50mm50stk) {
        this.beslagskruer4x50mm50stk = beslagskruer4x50mm50stk;
    }

    public void setBræddebolt10x120mm(int Bræddebolt10x120mm) {
        this.Bræddebolt10x120mm = Bræddebolt10x120mm;
    }

    public void setFirkantsskiver40x40x11mm(int Firkantsskiver40x40x11mm) {
        this.Firkantsskiver40x40x11mm = Firkantsskiver40x40x11mm;
    }

    public void setSkruer4komma5x70mm50stk(int skruer4komma5x70mm50stk) {
        this.skruer4komma5x70mm50stk = skruer4komma5x70mm50stk;
    }

    public void setSkruer4komma5x50mm50stk(int skruer4komma5x50mm50stk) {
        this.skruer4komma5x50mm50stk = skruer4komma5x50mm50stk;
    }

    public void setStalddørsgreb50x75(int Stalddørsgreb50x75) {
        this.Stalddørsgreb50x75 = Stalddørsgreb50x75;
    }

    public void setThængsel390mm(int Thængsel390mm) {
        this.Thængsel390mm = Thængsel390mm;
    }

    public void setVinkelbeslag35(int Vinkelbeslag35) {
        this.Vinkelbeslag35 = Vinkelbeslag35;
    }

    public void setBeslagskruer5x40mm50stk(int beslagskruer5x40mm50stk) {
        this.beslagskruer5x40mm50stk = beslagskruer5x40mm50stk;
    }

    public void setSkruer5x100mm50stk(int skruer5x100mm50stk) {
        this.skruer5x100mm50stk = skruer5x100mm50stk;
    }

    public int getId() {
        return id;
    }

    public int getTrykimpBrædt25x200mm360() {
        return TrykimpBrædt25x200mm360;
    }

    public int getTrykimpBrædt25x200mm540() {
        return TrykimpBrædt25x200mm540;
    }

    public int getTrykimpbrædt25x125mm360() {
        return trykimpbrædt25x125mm360;
    }

    public int getTrykimpbrædt25x125mm540() {
        return trykimpbrædt25x125mm540;
    }

    public int getLægteubh38x73mm420() {
        return lægteubh38x73mm420;
    }

    public int getRegulærub45x95mm270() {
        return regulærub45x95mm270;
    }

    public int getRegulærub45x95mm240() {
        return regulærub45x95mm240;
    }

    public int getRegulærub45x95mm360() {
        return regulærub45x95mm360;
    }

    public int getSpærtræubh45x195mm600() {
        return spærtræubh45x195mm600;
    }

    public int getSpærtræubh45x195mm480() {
        return spærtræubh45x195mm480;
    }

    public int getTrykimpstolpe97x97mm300() {
        return trykimpstolpe97x97mm300;
    }

    public int getTrykimpbrædt19x100mm210() {
        return trykimpbrædt19x100mm210;
    }

    public int getTrykimpbrædt19x100mm540() {
        return trykimpbrædt19x100mm540;
    }

    public int getTrykimpbrædt19x100mm360() {
        return trykimpbrædt19x100mm360;
    }

    public int getTrykimpbrædt19x100mm480() {
        return trykimpbrædt19x100mm480;
    }

    public int getTrykimpbrædt19x100mm240() {
        return trykimpbrædt19x100mm240;
    }

    public int getTrykimpbrædt25x150mm480() {
        return trykimpbrædt25x150mm480;
    }

    public int getTrykimpbrædt25x150mm600() {
        return trykimpbrædt25x150mm600;
    }

    public int getTrykimpbrædt25x150mm540() {
        return trykimpbrædt25x150mm540;
    }

    public int getFærdigskåret() {
        return færdigskåret;
    }

    public int getTrykimpbræt25x50mm540() {
        return trykimpbræt25x50mm540;
    }

    public int getTaglægteTI38x73mm540() {
        return taglægteTI38x73mm540;
    }

    public int getTaglægteTI38x73mm420() {
        return taglægteTI38x73mm420;
    }

    public int getBCdobbeltssort() {
        return BCdobbeltssort;
    }

    public int getBCrygstensort() {
        return BCrygstensort;
    }

    public int getBCtoplægterholder() {
        return BCtoplægterholder;
    }

    public int getBCrygstensbeslag() {
        return BCrygstensbeslag;
    }

    public int getBCtagstensbindereognakkekroge() {
        return BCtagstensbindereognakkekroge;
    }

    public int getPlastmoecoliteblåtonet600() {
        return Plastmoecoliteblåtonet600;
    }

    public int getPlastmoecoliteblåtonet360() {
        return Plastmoecoliteblåtonet360;
    }

    public int getPlastmobundskruer50stk() {
        return Plastmobundskruer50stk;
    }

    public int getHulbånd1x20mm10mtr() {
        return Hulbånd1x20mm10mtr;
    }

    public int getUniversal190mmhøjre() {
        return Universal190mmhøjre;
    }

    public int getUniversal190mmvenstre() {
        return Universal190mmvenstre;
    }

    public int getSkruer4komma5x60mm50stk() {
        return skruer4komma5x60mm50stk;
    }

    public int getBeslagskruer4x50mm50stk() {
        return beslagskruer4x50mm50stk;
    }

    public int getBræddebolt10x120mm() {
        return Bræddebolt10x120mm;
    }

    public int getFirkantsskiver40x40x11mm() {
        return Firkantsskiver40x40x11mm;
    }

    public int getSkruer4komma5x70mm50stk() {
        return skruer4komma5x70mm50stk;
    }

    public int getSkruer4komma5x50mm50stk() {
        return skruer4komma5x50mm50stk;
    }

    public int getStalddørsgreb50x75() {
        return Stalddørsgreb50x75;
    }

    public int getThængsel390mm() {
        return Thængsel390mm;
    }

    public int getVinkelbeslag35() {
        return Vinkelbeslag35;
    }

    public int getBeslagskruer5x40mm50stk() {
        return beslagskruer5x40mm50stk;
    }

    public int getSkruer5x100mm50stk() {
        return skruer5x100mm50stk;
    }
    
     public void calculate(int width, int length){
       double tempd, tempwidth, templength,hulbånd ;
       int tempi, hulbåndi;
       setTrykimpstolpe97x97mm300(6);
       //udregn rem
       setBræddebolt10x120mm(12);
       setFirkantsskiver40x40x11mm(12);
       
       //spær
       //antal spær
       tempd = (length/0.6) +2;
       tempi = (int) Math.round(tempd);
       if(width <= 540){
       setSpærtræubh45x195mm600(tempi);
       }else{
       setSpærtræubh45x195mm480(tempi); 
       }
       //beslag til spær og skruer
       setUniversal190mmhøjre(tempi);
       setUniversal190mmvenstre(tempi);
       tempi = (tempi*2)*9;
       tempd = tempi/50;
       tempi = (int) Math.ceil(tempd);      
       setBeslagskruer4x50mm50stk(tempi); 
       
       //Hulbånd og skruer
       tempwidth = width -70;
       templength = length -120;
       
       hulbånd = Math.pow(tempwidth, 2) + Math.pow(templength,2);
       hulbånd = Math.sqrt(hulbånd) * 2;
       hulbånd = hulbånd/10;
       hulbåndi = (int) Math.ceil(hulbånd);
       setHulbånd1x20mm10mtr(hulbåndi);
       if(getSpærtræubh45x195mm600() == 0){
           tempi = 4*(getSpærtræubh45x195mm480()-2);
       }else{
           tempi = 4*(getSpærtræubh45x195mm600()-2);
       }
       tempi = getBeslagskruer4x50mm50stk() + tempi;
       setBeslagskruer4x50mm50stk(tempi);
       
       //understernsbræt
       
       //oversternsbræt
       
       
       
     }
}
    

