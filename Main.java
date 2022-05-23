class Main {
  public static void main(String[] args) {
    cliente unCliente=new cliente();
    unCliente.nombre= "Leonardo";
    unCliente.edad=(35);
    unCliente.telefono=("4567890");
    unCliente.credito= (345);
    System.out.println("Nombre Cliente: "+unCliente.nombre);
    System.out.println("Edad: "+unCliente.edad);
    System.out.println("Telefono: "+unCliente.telefono);
    System.out.println("Credito para el cliente: $ "+unCliente.credito);
    trabajador unTrabajador=new trabajador();
    unTrabajador.nombre="Luciana";
    unTrabajador.edad=(43);
    unTrabajador.telefono=("987650");
    unTrabajador.salario=(987);
    System.out.println("Nombre Trabajador: "+unTrabajador.nombre);
    System.out.println("Edad: "+unTrabajador.edad);
    System.out.println("Telefono: "+unTrabajador.telefono);
    System.out.println("Salario para el trabajador: $" +unTrabajador.salario);
  }
}

class persona {
String nombre;
int edad;
String telefono;
}
class cliente extends persona{
 int credito;
}
class trabajador extends persona{
 int salario;
}