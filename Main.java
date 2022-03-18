package com.company;

public class Main {

    public static void main(String[] args) {
        class Animal {
            String name;
            String food;
            String location;

            public Animal(String name, String food, String location) {
                this.name = name;
                this.food = food;
                this.location = location;
            }

            public void makeNoise() {

                System.out.println("Звуки");
            }

            public void eat() {

                System.out.println("Ест");
            }

            public void sleep() {

                System.out.println("Спит");
            }
        }

        class Cat extends Animal {

            public Cat(String name, String food, String location) {
                super(name, food, location);
            }

            @Override
            public void makeNoise() {

                System.out.println("Мяу");
            }

            @Override
            public void eat() {

                System.out.println("Кошка ест");
            }
        }

        class Dog extends Animal {
            public Dog(String name, String food, String location) {
                super(name, food, location);
            }

            @Override
            public void makeNoise() {
                System.out.println("Гаф");
            }

            @Override
            public void eat() {
                System.out.println("Собака ест");
            }
        }

        class Horse extends Animal {
            String name;
            public Horse(String name, String food, String location) {
                super(name, food, location);
            }

            @Override
            public void makeNoise() {
                System.out.println("Игого");
            }

            @Override
            public void eat() {
                System.out.println("Лошадь ест");
            }
        }

        class Veterenar {
            void treatAnimal(Animal animal) {
                System.out.println(animal.food);
                System.out.println(animal.location);
            }
        }

        Veterenar vet = new Veterenar();
        Animal dog = new Dog("Макс", "Корм для кошек", "Будка");
        Animal cat = new Cat("Барсик","Корм для кошек", "Дома");
        Animal horse = new Horse ("Искра","Сено", "конюшня");
        vet.treatAnimal(dog);
        vet.treatAnimal(cat);
    }
}
