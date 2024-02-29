public class Ram {
    private String nameRam;
    private int volumeRam;
    
    public Ram(String nameRam, int volumeRam) {
        this.nameRam = nameRam;
        this.volumeRam = volumeRam;
    }

    public String getNameRam() {
        return nameRam;
    }

    public void setNameRam(String nameRam) {
        this.nameRam = nameRam;
    }

    public int getVolumeRam() {
        return volumeRam;
    }

    public void setVolumeRam(int volumeRam) {
        this.volumeRam = volumeRam;
    }

    @Override
    public String toString() {
        return "Память: " + nameRam + " " + volumeRam + "Гб";
    }
  
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nameRam == null) ? 0 : nameRam.hashCode());
        result = prime * result + volumeRam;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ram other = (Ram) obj;
        if (nameRam == null) {
            if (other.nameRam != null)
                return false;
        } else if (!nameRam.equals(other.nameRam))
            return false;
        if (volumeRam != other.volumeRam)
            return false;
        return true;
    }

    
}
