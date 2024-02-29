public class Cpu {

    private String nameCpu;
    private int frequencyСpu;
    
    public Cpu(String nameCpu, int frequencyСpu) {
        this.nameCpu = nameCpu;
        this.frequencyСpu = frequencyСpu;
    }

    public String getNameCpu() {
        return nameCpu;
    }

    public void setNameCpu(String nameCpu) {
        this.nameCpu = nameCpu;
    }

    public int getFrequencyСpu() {
        return frequencyСpu;
    }

    public void setFrequencyСpu(int frequencyСpu) {
        this.frequencyСpu = frequencyСpu;
    }

    @Override
    public String toString() {
        return "Процессор: " + nameCpu + " " + frequencyСpu + "МГц";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nameCpu == null) ? 0 : nameCpu.hashCode());
        result = prime * result + frequencyСpu;
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
        Cpu other = (Cpu) obj;
        if (nameCpu == null) {
            if (other.nameCpu != null)
                return false;
        } else if (!nameCpu.equals(other.nameCpu))
            return false;
        if (frequencyСpu != other.frequencyСpu)
            return false;
        return true;
    }

    
}
