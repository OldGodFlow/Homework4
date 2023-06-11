public class Main {
        public static void main(String[] args) {
            task1();
            task2();
            task3();
            task4();
            task5();
            task6();
            task7();
        }

        public static void task1() {
            System.out.println("Задача 1");
            int Age = 17 ;
            if (Age >= 18) {
                System.out.println("Если возраст человека равен " + Age + ", то он совершеннолетний") ;
            } else {
                System.out.println("Если возраст человека равен " + Age + ", то он не достиг совершеннолетия, нужно немного подождать");
            }

        }

            public static void task2() {
                System.out.println("Задача 2") ;
                int temperature = 7;
                if (temperature >= 5) {
                    System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
                }
                if (temperature < 5) {
                    System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
                }

            }

            public static void task3() {
                System.out.println("Задача 3") ;
                int currentSpeed = 86 ;
                if (currentSpeed > 60) {
                    System.out.println("Если скорость " + currentSpeed + ", то придется заплатить штраф") ; }
                if (currentSpeed <= 60) {
                    System.out.println("Если скорость " + currentSpeed + ", то можно ездить спокойно") ; }
            }

            public static void task4() {
                System.out.println("Задача 4");
                int age = 9;
                if (age < 2) {
                    System.out.println("Если возраст человека равен " + age + ", то ему пора спать") ; } else
                if (age >= 2 && age <= 6){
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад") ; } else
                if (age >= 7 && age <= 18) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу") ; } else
                if (age >= 18 && age < 24) {
                    System.out.println("Если возраст человека равен " + age + ", то его место в университете") ; } else
                if (age > 24){
                    System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу") ; } else
                if (age > 60){
                    System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть") ; }

            }

            public static void task5() {
                System.out.println("Задача 5");
                int childAge = 12;
                if (childAge < 5) {
                    System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе" ); } else
                        if (childAge >=5 && childAge < 14) {
                            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении" ); } else
                                if (childAge >= 14) {
                                    System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения" ); }
            }

            public static void task6() {
                System.out.println("Задача 6");
                byte carCapacity = 102 ;
                byte carSeats = 60 ;
                int passengerCount = 102;
                if (passengerCount < carSeats) {
                    System.out.println("В вагоне остались сидячие и стоячие места"); } else
                        if (passengerCount >= carSeats && passengerCount < carCapacity) {
                            System.out.println("В вагоне остались только стоячие места");} else {
                            System.out.println("В вагоне больше нет мест");}

            }

            public static void task7() {
                System.out.println("Задача 7");
                int one = 746;
                int two = 18;
                int three = 561839;
                if (one >= two && one > three) {
                    System.out.println("Большим числом является " + one); } else
                        if (two >= one && two > three) {
                            System.out.println("Большим числом является " + two);
                        } else {
                            System.out.println("Большим числом является " + three); }

            }
        }