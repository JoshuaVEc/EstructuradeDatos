package CP;

public class Practice03_HPaciente {
    String name;
    int clinicHistory=0;
    int age;
    String sex;

    public Practice03_HPaciente() {
    }

    public Practice03_HPaciente(String name, String sex, int clinicHistory, int age) {
        this.name = name;
        this.sex = sex;
        this.clinicHistory = clinicHistory;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }


    public int getClinicHistory() {
        return clinicHistory;
    }

}