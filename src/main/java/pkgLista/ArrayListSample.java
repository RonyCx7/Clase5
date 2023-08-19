package pkgLista;

import pkgEjercicio.ClsEjercicio6;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class ArrayListSample {
    public void ejemplo1(){
        List<String> taskList = new ArrayList<>();
        taskList.add("Sacar al perro");
        taskList.add("Ir de compras");
        taskList.add("Hacer la cama");
        taskList.add("Ir a votar");

        //System.out.println(taskList);

        //iterar
        //una iteración
        int pos = 0;
        for (String item : taskList){
            System.out.println(pos + " Tarea: " + item);
            pos++;
        }

        //String primerelemneto = taskList.get(0);
        //System.out.println("Elimina pos 0");
        //taskList.remove(0);
        //primerelemneto = taskList.get(0);
        //System.out.println("primer elemento =" + primerelemneto);
    }

    public void ejercio1(){
        //hacer una lista de numeros con los valores:
        //1000,2000,3000,4000
        //hacer una iteracio´n y mostrar la suma de esos números

        List<Integer> numlist = new ArrayList<Integer>();
        numlist.add(1000);
        numlist.add(2000);
        numlist.add(3000);
        numlist.add(4000);

        int resultado_de_suma = 0;
        for (int item : numlist) {
            System.out.println("La suma actual es " + resultado_de_suma);
            resultado_de_suma = resultado_de_suma + item;
        }
        System.out.println("La suma total es igual a: " + resultado_de_suma);
   }

   public void listaTareas(){
        List<ClsTaskList> tl = new ArrayList<>();
        ClsTaskList tarea = new ClsTaskList();

        tarea.setTaskName("Ir a votar");
        tarea.setTaskDescription("Ahi en la montufar compadre");
        tarea.setDone(false);
        tl.add(tarea);
        tarea = new ClsTaskList();

       tarea.setTaskName("Sacar al perro");
       tarea.setTaskDescription("Se llama dorito no nacho");
       tarea.setDone(false);
       tl.add(tarea);
       tarea = new ClsTaskList();

       tarea.setTaskName("hacer la cama");
       tarea.setTaskDescription("Tan rico que es dormir verdad :D");
       tarea.setDone(false);
       tl.add(tarea);
       tarea = new ClsTaskList();

       for (ClsTaskList item : tl){
           System.out.println("-----------------------------------------------------------------------");
           System.out.println("El nombre de la tarea es " + item.getTaskName());

       }
   }


}
