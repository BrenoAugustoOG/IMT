public class TesteListaDupla {
    public static void main(String[] args) {
        ListaDupla listaDupla = new ListaDupla();
        System.out.println("lista instanciada\n" + listaDupla);

        try {
            listaDupla.removeFim();
        } catch (RuntimeException rt) {
            System.out.println("Exceção: " + rt.getMessage());
        }
        // listaDupla.removeFim(); // removeFim() não faz nada, só para testar
        // listaDupla.removeInicio(); // removeInicio() não faz nada, só para testar

        listaDupla.insereInicio(10);
        listaDupla.insereInicio(20);
        listaDupla.insereInicio(30);

        System.out.println("lista após inserções no início\n" + listaDupla);

        listaDupla.insereFim(15);
        listaDupla.insereFim(25);
        listaDupla.insereFim(35);
        System.out.println("lista após inserções no fim\n" + listaDupla);

        System.out.println(listaDupla.removeInicio()+ " foi removido do início" );
        System.out.println(listaDupla.removeFim() + " foi removido do fim" );
    }
}
