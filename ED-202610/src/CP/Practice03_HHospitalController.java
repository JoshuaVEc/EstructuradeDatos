package CP;

import TDAs.DoublyLinkedList;

public class Practice03_HHospitalController {
    Practice03_HHospital hospital;

    DoublyLinkedList<Practice03_HPaciente> pacientesEspera = new DoublyLinkedList<>();
    DoublyLinkedList<Practice03_HPaciente> pacientesAtendidos = new DoublyLinkedList<>();

    public Practice03_HHospitalController(Practice03_HHospital hospital) {
        this.hospital = hospital;
    }

    public void addPacienteToEspera (Practice03_HPaciente paciente){
        pacientesEspera.addLast(paciente);
    }


    public void AtencionPacientes(){
        DoublyLinkedList<Practice03_HPaciente> noAtendidos = new DoublyLinkedList<>();
        Practice03_HPaciente pacienteActual= null;
        while(!pacientesEspera.isEmpty() && hospital.attentionCapacity >0){
            pacienteActual = pacientesEspera.removeFirst();
            if(pacienteActual.getAge()<10 || pacienteActual.getAge() > 60){
                pacientesAtendidos.addLast(pacienteActual);
                hospital.reduceAttentionCapacity();
            }else {
                noAtendidos.addLast(pacienteActual);
            }
        }

        while(!pacientesEspera.isEmpty()){
            noAtendidos.addLast(pacientesEspera.removeFirst());
        }
        while(!noAtendidos.isEmpty()){
            pacientesEspera.addLast((noAtendidos.removeFirst()));
        }


    }

    public boolean removePaciente(String Name){
        if(Name==null || pacientesEspera.isEmpty()){
            return false;
        }
        DoublyLinkedList<Practice03_HPaciente> copy = new DoublyLinkedList<>();
        Practice03_HPaciente actual = null;
        boolean eliminado =false;
        while(!eliminado && !pacientesEspera.isEmpty()){
           actual= pacientesEspera.removeFirst();
            if(actual.getName().equalsIgnoreCase(Name)){
                eliminado=true;
            }else{
                copy.addLast(actual);
            }

        }
        while(!copy.isEmpty()){
            pacientesEspera.addFirst(copy.removeLast());
        }
        return eliminado;
    }

    public DoublyLinkedList<Practice03_HPaciente> getPacientesAtendidos(){
        return pacientesAtendidos;
    }

}
