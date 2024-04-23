package br.com.alura.screenmatch.atividade.main.trycatch;

public class Conversao {
    private int firstNum,secondNum;
    private float resul;

    public void setNumbers(int first,int second){
        this.firstNum = first;
        this.secondNum = second;
    }

    public void returnResult(){
        try{
             resul = firstNum/secondNum;
             System.out.println(resul);
        }catch(ArithmeticException e){

            System.out.println(e.getMessage());
        }
    }

    public int getFirstNum() {
        return firstNum;
    }



    public int getSecondNum() {
        return secondNum;
    }


}
