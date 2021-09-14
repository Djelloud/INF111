public class Etudiant {

    private String strNomPrenom;
    private String strCodePermanent;
    private double[] tabNotes;
    private int nbNotes;

      public Etudiant(String strNomPrenom ,String strCodePermanent,double[] tabNotes, int nbNotes){
          this.strNomPrenom = strNomPrenom;
          this.strCodePermanent = strCodePermanent;
          this.tabNotes = tabNotes;
          this.nbNotes = nbNotes;
      }
    public String getCodePermanent() {
        return strCodePermanent;
    }

    public double[] getTabNotes() {
        return tabNotes.clone();
    }

    public String getStrNomPrenom() {
        return strNomPrenom;
    }

    public void insertNote(int index, double notes){
          nbNotes++;

        int i;

        double newArray[] = new double[index + 1];
        //copy original array into new array
        for (i = 0; i < index; i++)
        newArray[i] = tabNotes[i];

        //add element to the new array
        newArray[index] = notes;

    }
}
}
