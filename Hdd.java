public class Hdd {
    private String nameHdd;
    private int volumeHdd;
    
    public Hdd(String nameHdd, int volumeHdd) {
        this.nameHdd = nameHdd;
        this.volumeHdd = volumeHdd;
    }

    public String getNameHdd() {
        return nameHdd;
    }
    public void setNameHdd(String nameHdd) {
        this.nameHdd = nameHdd;
    }
    public int getVolumeHdd() {
        return volumeHdd;
    }
    public void setVolumeHdd(int volumeHdd) {
        this.volumeHdd = volumeHdd;
    }

    @Override
    public String toString() {
        return "Hdd [nameHdd=" + nameHdd + ", volumeHdd=" + volumeHdd + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nameHdd == null) ? 0 : nameHdd.hashCode());
        result = prime * result + volumeHdd;
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
        Hdd other = (Hdd) obj;
        if (nameHdd == null) {
            if (other.nameHdd != null)
                return false;
        } else if (!nameHdd.equals(other.nameHdd))
            return false;
        if (volumeHdd != other.volumeHdd)
            return false;
        return true;
    }
    
    
}
