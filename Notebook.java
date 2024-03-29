
import java.util.Map;

public class Notebook {

    private String name;
    private Cpu cpu;
    private Ram ram;
    private Hdd hdd;
    private String os;
    private String color;

    public Notebook(Cpu cpu, Ram ram, Hdd hdd, String os, String color, String name) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
        this.name = name;
    }

    public Notebook() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Notebook " + name + " (" + cpu + ", " + ram + "," + hdd + ", ОС: " + os + ", Цвет: "
                + color + ")";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((cpu == null) ? 0 : cpu.hashCode());
        result = prime * result + ((ram == null) ? 0 : ram.hashCode());
        result = prime * result + ((hdd == null) ? 0 : hdd.hashCode());
        result = prime * result + ((os == null) ? 0 : os.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
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
        Notebook other = (Notebook) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (cpu == null) {
            if (other.cpu != null)
                return false;
        } else if (!cpu.equals(other.cpu))
            return false;
        if (ram == null) {
            if (other.ram != null)
                return false;
        } else if (!ram.equals(other.ram))
            return false;
        if (hdd == null) {
            if (other.hdd != null)
                return false;
        } else if (!hdd.equals(other.hdd))
            return false;
        if (os == null) {
            if (other.os != null)
                return false;
        } else if (!os.equals(other.os))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        return true;
    }


    public boolean isPassOnCriterias(Map <String, String> criterias){
        String valueCriteriaString;
        Integer valueCriteriaInteger;
        
        valueCriteriaString = (String) criterias.get("color");
        if(valueCriteriaString != null){            
            if(!valueCriteriaString.equals(color))
                return false;
        }
        valueCriteriaString = (String) criterias.get("os");
        if(valueCriteriaString != null){            
            if(!valueCriteriaString.equals(os))
                return false;
        }
        valueCriteriaString = (String) criterias.get("name");
        if(valueCriteriaString != null){            
            if(!valueCriteriaString.equals(name))
                return false;
        }
        valueCriteriaString = (String) criterias.get("nameCpu");
        if(valueCriteriaString != null){            
            if(!valueCriteriaString.equals(cpu.getNameCpu()))
                return false;
        }    
        valueCriteriaString = (String) criterias.get("nameHdd");
        if(valueCriteriaString != null){            
            if(!valueCriteriaString.equals(hdd.getNameHdd()))
                return false;
        }
        valueCriteriaString = (String) criterias.get("nameRam");
        if(valueCriteriaString != null){            
            if(!valueCriteriaString.equals(ram.getNameRam()))
                return false;
        }
        
        if(criterias.get("volumeRam") != null){
            valueCriteriaInteger = Integer.valueOf((String) criterias.get("volumeRam"));            
            if(valueCriteriaInteger > ram.getVolumeRam())
                return false;
        }
  
        if(criterias.get("volumeHdd") != null){ 
            valueCriteriaInteger = Integer.valueOf((String) criterias.get("volumeHdd"));           
            if(valueCriteriaInteger > hdd.getVolumeHdd())
                return false;
        }
                
        if(criterias.get("frequencyСpu") != null){
            valueCriteriaInteger = Integer.valueOf((String) criterias.get("frequencyСpu"));            
            if(valueCriteriaInteger > cpu.getFrequencyСpu())
                return false;
        }
        
        return true;
    }
}
