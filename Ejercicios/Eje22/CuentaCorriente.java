package Ejercicios.Eje22;

import java.util.ArrayList;

public class CuentaCorriente {
    private ArrayList<String> mov;
    private double saldo;
    private int numeroCuenta;

    public CuentaCorriente(){
        this.numeroCuenta= generaNumCuenta(); 
        this.saldo = 0;
        this.mov = new ArrayList<String>();
    }

    public CuentaCorriente(int saldo){
        this.numeroCuenta= generaNumCuenta(); 
        this.saldo = saldo;
        this.mov = new ArrayList<String>();
    }

    @Override
    public String toString() {
        return String.format("Número de cta: %d - Saldo: %.2f $",this.numeroCuenta,this.saldo);
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingreso(double saldo){
        this.setSaldo(this.getSaldo()+saldo);
        mov.add(String.format("Ingreso de %.2f $ Saldo: %.2f $", saldo, this.saldo));
    }

    public void cargo(double saldo){
        this.setSaldo(this.getSaldo()-saldo);
        mov.add(String.format("Cargo de %.2f $ Saldo: %.2f $", saldo, this.saldo));
    }

    public void transferencia(CuentaCorriente c,double saldo){
        c.setSaldo(c.getSaldo()+saldo);
        this.setSaldo(this.getSaldo()-saldo);
        this.mov.add(String.format("Transf. recibida de %.2f $ de la cuenta %d Saldo: %.2f $", saldo, c.generaNumCuenta(), this.saldo));
        c.mov.add(String.format("Transf. emitida de %.2f $ de la cuenta %d Saldo: %.2f $", saldo, this.generaNumCuenta(), c.getSaldo()));
    }

    public void movimientos(){
        System.out.println("Movimientos de la cuenta "+this.numeroCuenta);
        System.out.println("----------------------------------");
        for (String st : mov) {
            System.out.println(st);
        }
    }

    public int generaNumCuenta(){
        int num = 0;
        for (int i = 0; i < 10; i++) {
            num = num*10 + (int)(Math.random()*10);
        }

        return Math.abs(num);
    }

}
