public class Hodnoceni {

    private String predmet;
    private int znamka;
    private int nejlepsi;



    Hodnoceni(String predmet, int znamka) {
        this.predmet = predmet;
        this.znamka = znamka;
    }


    public int nejlepsiHodnoceni() {
        for (int i = 0; i < 3; i++) {
            nejlepsi = 5;
            if (znamka < nejlepsi) {
                nejlepsi = znamka;
            }
        }
        return nejlepsi;
    }

    public void vypisNejlepsiHodnoceni() {
        System.out.println(nejlepsi);
    }
















}
