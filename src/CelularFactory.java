public class CelularFactory {
    public Celular criarCelular(int num){
        Celular celular;
        if(num == 1){
            celular = new iPhone();
        }
        else{
            celular = new Android();
        }
        return celular;
    }
}