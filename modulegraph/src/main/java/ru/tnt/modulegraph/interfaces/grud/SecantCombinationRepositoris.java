package ru.tnt.modulegraph.interfaces.grud;

import org.springframework.data.repository.CrudRepository;
import ru.tnt.modulegraph.models.SecantСombination;

import java.util.List;

/*
 * Интерфейс для работы с таблицей БД SecantСombination
 * @author radik
 * @version 1.0
 */
public interface SecantCombinationRepositoris extends CrudRepository<SecantСombination,Long> {

    /*
     * Метод для списка секущих комбинаций по id
     * @return Везвращает List типа класса SecantСombination
     * @author radik
     * @version 1.0
     */
    List<SecantСombination> findFirstById(Long id);
}
