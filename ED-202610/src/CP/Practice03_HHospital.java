package CP;

public class Practice03_HHospital {
    String name;
    String address;
    int attentionCapacity;

    public Practice03_HHospital() {
    }

    public Practice03_HHospital(String address, String name, int attentionCapacity) {
        this.address = address;
        this.name = name;
        this.attentionCapacity = attentionCapacity;
    }

    public int getAttentionCapacity() {
        return attentionCapacity;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    public void reduceAttentionCapacity(){
        if(attentionCapacity > 0){
            attentionCapacity--;
        }

    }
}
