/*
 *Author: Juan Pablo Robles Arias
 *Date: 2019-nov-21
 *Description: This program generete of salaries the employees of company Boyaca ancestral food
 */
package p3t_final_work;

import java.util.Scanner;
import java.io.PrintWriter;

public class P3T_FINAL_WORK {

    static int[][] vector;

    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            int option;
            do {
                show_menu();
                option = keyboard.nextInt();
                switch (option) {
                    case 1:
                        vector = generete_datos();
                        generate_resul_txt(vector);

                        break;
                    case 2:
                        show_result(vector);
                        break;
                    case 3:
                        show_win_employee_twenty_millions(vector);
                        break;
                    case 4:
                        show_average_salaries_semester1(vector);
                        show_average_salaries_semester2(vector);
                        show_average_salaries_semester3(vector);
                        show_average_salaries_semester4(vector);
                        break;
                    case 5:
                        show_max_salaries(vector);
                        break;
                    case 6:
                        show_min_salaries(vector);
                        break;
                    case 0:
                        System.out.println("============Universidad Santo Tomas===============\nGracias por utilizar nuestro software");
                        break;
                    
                    default:
                        System.err.println("Opción no encontrada, seleccione una de las opciones disponibles");
                        break;

                }
            } while (option != 0);

        } catch (Exception e) {
            System.err.println("Aborted system" + e.toString());
        }
    }

    public static void show_menu() {
        //this function show menu principal this program Boyaca ancestral food
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("------------Software de nomina para empresa Boyaca Ancestral food-----------");
            System.out.println("Creado por: Juan Pablo Robles Arias");
            System.out.println("Menú principal");
            System.out.println("1. Generar base de datos");
            System.out.println("2. Visualizar base de datos");
            System.out.println("3. Empleaddos que ganaron mas de $20.000.000");
            System.out.println("4. Promedio de sueldos por trimestre");
            System.out.println("5. Empleado con mayor ganancia de sueldos en el año");
            System.out.println("6. Empleado con menor ganancia de sueldos en el año");
            System.out.println("0. Salir del software");
            System.out.println("            seleccione una opcion                            ");

        } catch (Exception e) {
            System.err.println("Aborted system " + e.toString());
        }
    }

    public static int[][] generete_datos() {
        //this function generete of salaries of employees random the company
        try {
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Ingrese el numero de empleados de la empresa ");
            int n = keyboard.nextInt();
            int vector[][] = new int[n][4];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 4; j++) {
                    vector[i][j] = (int) Math.round(Math.random() * (3312464 - 828116) + 1 * 828116);
                }

            }

            return vector;
        } catch (Exception e) {
            System.err.println("Aborted system " + e.toString());
            return null;
        }
    }

    public static void show_result(int[][] vector) {
        //this function show result of the pyroll the company Boyaca Ancestral food
        try {
            for (int i = 0; i < vector.length; i++) {

                System.out.println("El empleado " + (i + 1) + " su sueldo en el "
                        + "primer semestre es del año es: $" + vector[i][0]
                        + " segundo semestre es: $" + vector[i][1] + " tercer "
                        + "semestre es: $" + vector[i][2] + " cuarto "
                        + "semestre es: $" + vector[i][3]);
                int total = vector[i][0] + vector[i][1] + vector[i][2] + vector[i][3];
                System.out.println("El empleado " + (i + 1) + " tine un salario total en el año de: $" + total);
            }

        } catch (Exception e) {
            System.err.println("Aborted system" + e.toString());
        }
    }

    public static int show_win_employee_twenty_millions(int[][] vector) {
        //this function show employees with salaries the year 20.000.000
        try {
            int empleado = 0;
            for (int i = 0; i < vector.length; i++) {
                int total = vector[i][0] + vector[i][1] + vector[i][2] + vector[i][3];
                if (total >= 20000000) {
                    empleado += 1;
                }
            }
            System.out.println("El numero de empleados que su sueldo anual fue mayor a $20.000.000 son: " + empleado);
            return empleado;
        } catch (Exception e) {
            System.err.println("Aborted system" + e.toString());
            return 0;
        }
    }

    public static int show_max_salaries(int[][] vector) {
        //this function show salaries max of the year in the company 
        try {
            int empleado = 0;
            int max = 0;
            for (int i = 0; i < vector.length; i++) {
                int total = vector[i][0] + vector[i][1] + vector[i][2] + vector[i][3];
                if (i == 0) {
                    max = total;
                    empleado = i;
                } else if (total > max) {
                    max = total;
                    empleado = i;
                }
            }
            System.out.println("El empleado con mayor ganancia de sueldo en el año es: "+(empleado+1));
            return empleado + 1;
        } catch (Exception e) {
            System.err.println("Aborted sysrem" + e.toString());
            return 0;
        }
    }

    public static int show_min_salaries(int[][] vector) {
        //this function show salaries min of the year in the company 
        try {
            int empleado = 0;
            int min = 0;
            for (int i = 0; i < vector.length; i++) {
                int total = vector[i][0] + vector[i][1] + vector[i][2] + vector[i][3];
                if (i == 0) {
                    min = total;
                    empleado = i;
                } else if (total < min) {
                    min = total;
                    empleado = i;
                }
            }
            System.out.println("El empleado con menor ganancia de sueldo en el año es: "+(empleado+1));
            return empleado + 1;
        } catch (Exception e) {
            System.err.println("Aborted sysrem" + e.toString());
            return 0;
        }
    }

    public static double show_average_salaries_semester1(int[][] vector) {
        //this function average salaries of year semester one
        try {
            int sum1 = 0;
            for (int i = 0; i < vector.length; i++) {
                sum1 += vector[i][0];
            }
            double average1 = sum1 / vector.length;
            System.out.println("El promedio de sueldo en el semestre(1) del año es de: $"+average1);
            return average1;
        } catch (Exception e) {
            System.err.println("Aborted system" + e.toString());
            return 0;
        }

    }

    public static double show_average_salaries_semester2(int[][] vector) {
        //this function average salaries of year semester two
        try {
            int sum2 = 0;
            for (int i = 0; i < vector.length; i++) {
                sum2 += vector[i][1];
            }
            double average2 = sum2 / vector.length;
            System.out.println("El promedio de sueldo en el semestre(2) del año es de: $"+ average2);
            return average2;
        } catch (Exception e) {
            System.err.println("Aborted system" + e.toString());
            return 0;
        }
    }

    public static double show_average_salaries_semester3(int[][] vector) {
        //this function average salaries of year semester three
        try {
            int sum3 = 0;
            for (int i = 0; i < vector.length; i++) {
                sum3 += vector[i][2];
            }
            double average3 = sum3 / vector.length;
            System.out.println("El promedio de sueldo en el semestre(3) del año es de: $"+average3);
            return average3;
        } catch (Exception e) {
            System.err.println("Aborted sytem" + e.toString());
            return 0;
        }
    }

    public static double show_average_salaries_semester4(int[][] vector) {
        //this function average salaries of year semester for
        try {
            int sum4 = 0;
            for (int i = 0; i < vector.length; i++) {
                sum4 += vector[i][3];
            }
            double average4 = sum4 / vector.length;
            System.out.println("El promedio de sueldo en el semestre(4) del año es de: $"+average4);
            return average4;
        } catch (Exception e) {
            System.err.println("Aborted system" + e.toString());
            return 0;
        }
    }

    public static void generate_resul_txt(int[][] vector) {
        //
        try {
            PrintWriter archivo = new PrintWriter("d:/Company_Boyaca_Ancestral_food.txt", "UTF-8");
            archivo.println("this file is automatically created by java");
            for (int i = 0; i < vector.length; i++) {

                archivo.println("El empleado " + (i + 1) + " su sueldo en el "
                        + "primer semestre es del año es: $" + vector[i][0]
                        + " segundo semestre es: $" + vector[i][1] + " tercer "
                        + "semestre es: $" + vector[i][2] + " cuarto "
                        + "semestre es: $" + vector[i][3]);
                int total = vector[i][0] + vector[i][1] + vector[i][2] + vector[i][3];
                archivo.println("El empleado " + (i + 1) + " tine un salario total en el año de: $" + total);
            }
            archivo.println("-----------------------Reporte de nomina Boyaca Ancestral food-------------- ");
            archivo.println("El numero de empleados que su sueldo anual fue mayor a $20.000.000 son: " + show_win_employee_twenty_millions(vector));
            archivo.println("El promedio de sueldo en el semestre(1) del año es de: $" + show_average_salaries_semester1(vector));
            archivo.println("El promedio de sueldo en el semestre(2) del año es de: $" + show_average_salaries_semester2(vector));
            archivo.println("El promedio de sueldo en el semestre(3) del año es de: $" + show_average_salaries_semester3(vector));
            archivo.println("El promedio de sueldo en el semestre(4) del año es de: $" + show_average_salaries_semester4(vector));
            archivo.println("El empleado con mayor ganancia de sueldo en el año es: " + show_max_salaries(vector));
            archivo.println("El empleado con menor ganancia de sueldo en el año es: " + show_min_salaries(vector));
            archivo.close();
            System.out.println("Generete result of company Boyaca ancestral food in d:/Company_Boyaca_Ancestral_food.txt ");
        } catch (Exception e) {
            System.err.println("Aborted sytem" + e.toString());
        }
    }
}
