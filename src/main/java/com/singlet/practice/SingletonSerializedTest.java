package com.singlet.practice;

import com.sun.corba.se.impl.orbutil.ObjectWriter;

import java.io.*;

public class SingletonSerializedTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializedSingle instanceOne = SerializedSingle.getInstance();

        ObjectOutput op = new ObjectOutputStream(new FileOutputStream("balchal"));
        op.writeObject(instanceOne);
        op.close();
        ObjectInput op1 = new ObjectInputStream(new FileInputStream("balchal"));
        SerializedSingle tt = SerializedSingle.getInstance();
        tt = (SerializedSingle)op1.readObject();
        op1.close();
        System.out.println(op.hashCode());
        System.out.println(op1.hashCode());
        System.out.println(op1.hashCode() == op.hashCode() ? true : false);
    }
}
