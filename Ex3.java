package Lab2;

import java.io.*;

public class Ex3 implements Externalizable {

    public static void main(String[] args) {
        Ex33 man =new Ex33("Ramazan",20);
        System.out.println(man);
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        try (ObjectInputStream ois= new ObjectInputStream(new FileInputStream("Man.bin"))){

            ois.getObjectInputFilter();

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        try (ObjectInputStream ois= new ObjectInputStream(new FileInputStream("Man.bin"))){
            Ex33 man=(Ex33) ois.readObject();
            System.out.println(man);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();

        }
    }
}
