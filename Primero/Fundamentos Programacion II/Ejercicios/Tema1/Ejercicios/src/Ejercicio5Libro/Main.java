package Ejercicio5Libro;

public class Main {

    public static void main(String[] args) {

    Libro primero = new Libro("Quijote 1.0", "Miguel de Cervantes Saavedra",1995, "asbasfsagf",
            new String[]{
                    "«En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor.»",
                    "«Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lentejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda.»",
                    "«El resto della concluían sayo de velarte, calzas de velludo para las fiestas con sus pantuflos de lo mismo, y los días de entre semana se honraba con su vellorí de lo más fino.»",
                    "«Tenía en su casa una ama que pasaba de los cuarenta, y una sobrina que no llegaba a los veinte, y un mozo de campo y plaza, que así ensillaba el rocín como tomaba la podadera.»",
                    "«Frisaba la edad de nuestro hidalgo con los cincuenta años; era de complexión recia, seco de carnes, enjuto de rostro, gran madrugador y amigo de la caza.»",
                    "«Quieren decir que tenía el sobrenombre de Quijada, o Quesada, que en esto hay alguna diferencia en los autores que deste caso escriben; aunque por conjeturas verosímiles se deja entender que se llamaba Quijana.»",
                    "«Pero esto importa poco a nuestro cuento; basta que en la narración dél no se salga un punto de la verdad.»",
                    "«Es, pues, de saber, que este sobredicho hidalgo, los ratos que estaba ocioso —que eran los más del año— se daba a leer libros de caballerías con tanta afición y gusto, que olvidó casi de todo punto el ejercicio de la caza, y aun la administración de su hacienda.»",
                    "«Y llegó a tanto su curiosidad y desatino en esto, que vendió muchas hanegas de tierra de sembradura, para comprar libros de caballerías en que leer; y así llevó a su casa cuantos pudo haber dellos.»",
                    "«Y de todos ningunos le parecían tan bien como los que compuso el famoso Feliciano de Silva; porque la claridad de su prosa y aquellas intrincadas razones suyas le parecían de perlas.»"
            }

            );
        String paginaNueva = "Esta es una prueba de página nueva";

        primero.insertarPagina(paginaNueva, 11);

        System.out.println(primero.leerPagina());
        System.out.println(primero.leerPagina());
        System.out.println(primero.leerPagina());
        System.out.println(primero.leerPagina());
        System.out.println(primero.leerPagina());
        System.out.println(primero.leerPagina());
        System.out.println(primero.leerPagina());

        System.out.println(primero.leerPagina());
        System.out.println(primero.leerPagina());
        System.out.println(primero.leerPagina());

        System.out.println(primero.leerPagina());

        primero.volverAlPrincipio();


        primero.sustituirPagina("Papadopoulos es un nombre griego.",3);
        System.out.println(primero.leerPagina());
        System.out.println(primero.leerPagina());
        System.out.println(primero.leerPagina());
        System.out.println(primero.leerPagina());

        primero.borrarPagina(3);

        primero.volverAlPrincipio();
        System.out.println(primero.leerPagina());
        System.out.println(primero.leerPagina());
        System.out.println(primero.leerPagina());
        System.out.println(primero.leerPagina());


        Libro segundo = new Libro("Quijote 1.0", "Miguel de Cervantes Saavedra",1995, "0bsaffg0asdf",
                new String[]{
                        "Especialmente cuando llegaba a leer aquellos requiebros y cartas de desafío, donde en muchas partes hallaba escrito: 'La razón de la sinrazón que a mi razón se hace, de tal manera mi razón enflaquece, que con razón me quejo de la vuestra fermosura', y otras semejantes razones.",
                        "Con estas razones perdía el pobre caballero el juicio y desvelábase por entenderlas, y desentrañarles el sentido, que no se lo sacara ni el mismo Aristóteles, si resucitara para solo ello.",
                        "No estaba muy bien con las heridas que don Belianís daba y recibía, porque se imaginaba que, por grandes maestros que lo hubiesen curado, no dejaría de tener el rostro y todo el cuerpo lleno de cicatrices y señales.",
                        "Mas con todo alababa en su autor aquel acabar su libro con la promesa de aquella inacabable aventura, y muchas veces le vino deseo de tomar la pluma y dar fin al pie de aquella labor, como allí se promete.",
                        "Y sin duda alguna lo hiciera, y aun le saliera con ello, si otros mayores y continuos pensamientos no se lo estorbaran.",
                        "Tuvo muchas veces competencia con el cura de su lugar, que era hombre docto, graduado en Sigüenza, sobre cuál había sido mejor caballero, Palmerín de Inglaterra o Amadís de Gaula.",
                        "Mas maese Nicolás, barbero del mismo pueblo, decía que ninguno llegaba al Caballero del Febo, y que si alguno se le podía comparar, era don Galaor, hermano de Amadís de Gaula, porque tenía un todo de valiente y de comedido.",
                        "En resolución, él se enfrascó tanto en su letura, que se le pasaban las noches leyendo de claro en claro, y los días de turbio en turbio; y así, del poco dormir y del mucho leer, se le secó el cerebro, de manera que vino a perder el juicio.",
                        "Llenósele la fantasía de todo aquello que leía en los libros, así de encantamientos como de pendencias, batallas, desafíos, heridas, requiebros, amores, tormentas y disparates imposibles.",
                        "Firmábasele que todo aquello que leía era verdad, y que la vida de los caballeros andantes era la más dichosa que se podía hallar en el mundo."
                }

        );

        Libro tercero = new Libro("Quijote 3.0", "Miguel de Cervantes Saavedra",1605, "asbasfsagf",
                new String[]{
                        "En efecto, rematado ya su juicio, vino a dar en el más extraño pensamiento que jamás dio loco en el mundo.",
                        "y fue que le pareció convenible y necesario, así para el aumento de su honra como para el servicio de su república, hacerse caballero andante.",
                        "e irse por todo el mundo con sus armas y caballo a buscar las aventuras y a ejercitarse en todo aquello que él había leído que los caballeros andantes se ejercitaban.",
                        "deshaciendo todo género de agravio y poniéndose en ocasiones y peligros, donde, acabándolos, cobrase eterno nombre y fama.",
                        "figurábase el pobre ya coronado por el valor de su brazo, poco menos que del emperador de Trapisonda.",
                        "y así, con estos tan agradables pensamientos, se apresuraba a poner en ejecución lo que deseaba.",
                        "lo primero que hizo fue limpiar unas armas que habían sido de sus bisabuelos, y que, tomadas de orín, hacía siglos que yacían olvidadas en un rincón.",
                        "puso todo su cuidado en repararlas y aderezar con ellas un morrión que le servía de celada, y lo remendó lo mejor que pudo.",
                        "advirtió entonces que le faltaba la visera, y sustituyéndola con cartón, la encajó en la parte delantera y la guarneció con cintas, imaginando que quedaba fortísima.",
                        "pero, habiéndola probado con la espada y viendo que con un solo tajo la hizo pedazos, terminó por repararla con tiras de hierro para que quedase segura y firme."
                }


        );

        Libro larra = new Libro("Vuelva usted mañana", "Mariano José de Larra",1833, "osjafsagdsajkg",
                new String[]{
                        "Venía yo a creer que, de hoy en más, ya no tendría nada que escribir; pero la Providencia, que provee a las necesidades del hombre hasta lo increíble, me ha deparado un francés que me pide la hospitalidad de mis páginas, y ello me brinda materia de muchos renglones.",
                        "¿Cómo he de negarme a ser su huésped?",
                        "Aun no se ha hecho ley en este país de la aristocracia literaria.",
                        "Cada escritor no ha cercado de tapias y valladares el ejido de su pensamiento.",
                        "Si un extranjero llama a la puerta, ¿hemos de decirle: 'Vuelva usted mañana'?",
                        "Si no quedase con eso burlado su goce, quedaría defraudado el nuestro.",
                        "El bello monólogo que subsigue es, pues, la primera deuda que contraje con la Providencia.",
                        "Desearía poderle prestar introducción y comentario; pero la holgazanería, reina del país, me lo vedará.",
                        "Cuando el lector lo vea encadenado de la manera que se ve en mis manuscritos, creerá que hay en ello mano de hombre.",
                        "Yo le protesto, sin embargo, que las cuartillas sueltas me llegaban al escritorio como me llegan las cuentas sueltas de la modista."
                }


        );

        larra.unirCon(primero);
        System.out.println("\n\n\n\n");
        System.out.println(segundo.getNumPag());
        System.out.println(tercero.getNumPag());

        segundo.unirCon(tercero);

        System.out.println(segundo.getNumPag());
        System.out.println("\n\n\n\n");

        for(int i=0; i<segundo.getNumPag(); i++)
        {
            System.out.println(segundo.leerPagina());
        }



    }


}
