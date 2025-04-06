package com.cloning;

class Person implements Cloneable{
    private String name;
    private Address address;

    Person(String name,Address address){
        this.name=name;
        this.address = address;
    }


    public String getName(){
       return this.name;
    }
    public Address getAddress(){
        return this.address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
   /* //Shallow Cloning(Default Cloning present in object class)
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }*/

    //Deep Cloning recommended when Object contain reference
    public Object clone() {
        Address address = new Address(getAddress().getPostcode());
        Person p = new Person(name,address);
        return p;
    }

}

class Address{
    private String postcode;

    Address(String postcode){
     this.postcode = postcode;
    }

    public String getPostcode(){
        return this.postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}

public class CloneTest{
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p = new Person("Pradyumna",new Address("BH25DW"));
        System.out.println("Name:"+p.getName()+" and postcode:"+p.getAddress().getPostcode());
        Person cloneP = (Person)p.clone();
        p.setName("Dipu");
        Address address2 = p.getAddress();
        address2.setPostcode("BALIMI");
        p.setAddress(address2);
        System.out.println("Name:"+cloneP.getName()+" and postcode:"+cloneP.getAddress().getPostcode());
    }
}
