package ru.avalon.java.dev.ocpjp.labs;

import ru.avalon.java.dev.ocpjp.labs.models.Commodity;

import java.io.IOException;
import java.util.Collection;

public class Main {

    public static void main(String[] args) throws IOException {
        final Collection<Commodity> commodities = Commodity.random(100);
      
        /*
         * TODO(Студент): С использованием Java Stream API выполнить задачи из списка:
         * 1. Выполнить поиск самого дорого товара
         * 2. Найти товары с минимальным остатком
         * 3. Найти товары с остатком меньшим 5 и вывести в консоль их названия
         * 4. Подсчитать общую стоимость товаров с учётом их остатка
         * 5. Найти товар, с самым длинным названием и вывести его на экран
         * 6. Выполнить сортировку коллекции commodities
         * 7. Найти среднюю стоимость товаров
         * 8. Найти моду (медиану) стоимости товаров
         */
        
        System.out.println("Cамый дорогой товар: " + commodities.stream().map((s)-> s.getPrice()).max(Double::compare).toString());
        
        System.out.println("Товары с минимальным остатком: " + commodities.stream().map((s)-> s.getResidue()).min(Integer::compare).toString());
        
        System.out.print("Товары с остатком меньшим 5: ");
        commodities.stream().filter((s) -> (s.getResidue()) < 5).forEach((s) -> System.out.println(s.getName()));
                                
        System.out.println("Общая стоимость товаров с учётом их остатка: " + commodities.stream().mapToDouble((s)-> (s.getResidue() * s.getPrice())).sum());
                
        System.out.println("Товар с самым длинным названием: " + commodities.stream().mapToInt((s)-> s.getName().length()).max());
                 
        System.out.println("Сортировка коллекции commodities: " + commodities.stream().sorted());
    
        System.out.println("Средняя стоимость товаров: " + commodities.stream().mapToDouble((s)-> s.getPrice()).average());
 
    }
}
