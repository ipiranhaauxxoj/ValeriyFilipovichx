package com.company;

class QueueClass{

    int queueLength;        // полученная длина очереди
    int[] queueMass;       // массив целочисленных значений
    int queueBegin = 0;   // начало очереди
    int queueEnd = 0;    // конец очереди
    int index = 0;      // длина очереди

    // Конструктор, принимающий значение длины очереди (массива) при создании объекта класса
    QueueClass(int n)
    {
        System.out.print("Конструктор: Cоздаю массив С(30) из случайных чисел от 0 до 20 ");
        queueLength = n;
        queueMass = new int [queueLength];
        for (int i = 0; i < queueMass.length; i++) {
            queueMass[i] = (int) Math.round((Math.random() * 20));
        }
        index = queueMass.length;
        queueInfo();
    }

    // Метод Put для добавления элемента в конец очереди
    public void queuePut(int newElement){

        if (index != queueMass.length) {
            queueMass[index] = newElement;
        }
        else {
            System.out.println("queuePut: Массив переполнен! Увеличение массива в два раза...");
            queueIncrease(2* queueMass.length);
            queueMass[index] = newElement;
            System.out.println("queuePut: Повторное добавление элемента (" + newElement + ")...");
        }
        System.out.print("queuePut: Элемент (" + newElement + ") успешно добавлен в конец очереди!");
        index++;
        queueEnd = index - 1;
        queueInfo();
    }

    private void queueIncrease (int capacity) {
       int[] queueMassCopy = new int[capacity];
        System.arraycopy(queueMass, 0, queueMassCopy, 0, queueMass.length);
        queueMass = queueMassCopy;
        System.out.print("queueIncrease: Массив увеличен! Новый размер массива - " + queueMass.length);
        queueInfo();
    }

    // 3. Метод Get для получения очередного элемента из начала очереди.
    public int queueGet(){
        if (queueBegin <= queueEnd) { // если в очереди есть элементы
            if((queueEnd - queueBegin) < 0.5*queueMass.length) {
                System.out.println("queueGet: Размер массива слишком большой для очереди! Уменьшаем массив...");
                queueDecrease();
            }
            int elementToFind = queueMass[queueBegin++];
            if(queueBegin>queueEnd) queueBegin--;
            System.out.println("queueGet: Элемент (" + elementToFind + ") успешно получен!");
            index--; // уменьшаем длину очереди (т.к. "выттащили" элемент)
            return elementToFind;
        } else {
            System.out.println("queueGet: В очереди нет ни одного элемента!");
            return 0;
        }
    }

    private void queueDecrease () {
        int j = 0;
        int[] queueMassCopy = new int[queueEnd - queueBegin + 1];
        for(int i = queueBegin; i < queueEnd + 1; i++) {
            queueMassCopy[j] = queueMass[i];
            j++;
        }
        queueMass = queueMassCopy;
        queueBegin = 0;
        queueEnd = queueMass.length - 1;
        index = queueMass.length+1;
        System.out.print("queueDecrease: Массив уменьшен! Новый размер массива - " + queueMass.length);
        queueInfo();
    }

    // 4.	Метод GetAll который возвращает массив в который копируются
    public int[] queueGetAll(){
        int j = 0;
        int[] queueGetMass = new int[queueEnd - queueBegin + 1];
        for(int i=queueBegin; i<queueEnd + 1; i++) {
            queueGetMass[j] = queueMass[i];
            j++;
        }
        System.out.print("queueGetAll: Достаю все элементы из очереди.. ");
        return queueGetMass;
     }

    // Метод сортировки (сортировка вставками) очереди
    public void queueSort(){
        System.out.print("queueSort: Сортировка массива...");
        for (int i = 1; i < queueMass.length; i++) {
            int key = queueMass[i];
            int j = i - 1;
            while (j >= 0 && queueMass[j]> key) {
                queueMass[j + 1]= queueMass[j];
                j = j - 1;
            }
            queueMass[j + 1]= key;
        }
        queueInfo();
    }

    public double queueFindAverage() {

        System.out.print("queueFindAverage: Нахожу среднее значение...\n");
        if (queueMass.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < queueMass.length; j++) {
                sum += queueMass[j];
            }
            return sum / queueMass.length;
        }
        else
            return 0;
    }

    private void queueInfo () {
        System.out.print("  (Массив: ");
        for (int mass : queueMass) {
            System.out.print("  " +mass);
        }
        System.out.print(")\n");
    }

}

public class Main {
    public static void main(String[] args) {
        QueueClass newQueue = new QueueClass(30); // создание новой очереди с заданной длинной
        newQueue.queueSort(); // сортировка созданного массива

        newQueue.queuePut(1);
        newQueue.queuePut(2);
        newQueue.queuePut(3);
        newQueue.queuePut(4);

        int[] QueueElements = {newQueue.queueGet(), newQueue.queueGet(), newQueue.queueGet(),
                               newQueue.queueGet(), newQueue.queueGet(), newQueue.queueGet(),
                               newQueue.queueGet(), newQueue.queueGet(), newQueue.queueGet(),
                               newQueue.queueGet(), newQueue.queueGet(), newQueue.queueGet(),
                               newQueue.queueGet(), newQueue.queueGet(), newQueue.queueGet()
            };

        System.out.print("----------------Полученная очередь (Get): ");
        for (int j : QueueElements) {
            System.out.print(j + " ");
        }
        System.out.print("----------------\n");



        int[] QueueAllElements = newQueue.queueGetAll(); //
                                                        //
        System.out.print("\n-------------Полученная очередь (GetAll): ");
        for (int j : QueueAllElements) {
            System.out.print(j + " ");
        }
        System.out.print("----------------\n");






        double averageValue = newQueue.queueFindAverage();
        System.out.print("----------------Среднее значение (queueFindAverage): " +
                            averageValue + "----------------\n");
    }
}
