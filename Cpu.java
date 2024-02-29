public class Cpu {

    private int nameCpu;
    private int frequencyСpu;
    
    public Cpu(int nameCpu, int frequencyСpu) {
        this.nameCpu = nameCpu;
        this.frequencyСpu = frequencyСpu;
    }

    public int getNameCpu() {
        return nameCpu;
    }

    public void setNameCpu(int nameCpu) {
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
        return "Cpu [nameCpu=" + nameCpu + ", frequencyСpu=" + frequencyСpu + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + nameCpu;
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
        if (nameCpu != other.nameCpu)
            return false;
        if (frequencyСpu != other.frequencyСpu)
            return false;
        return true;
    }
    
}
