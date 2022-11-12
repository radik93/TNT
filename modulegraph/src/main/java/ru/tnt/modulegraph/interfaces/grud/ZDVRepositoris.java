package ru.tnt.modulegraph.interfaces.grud;

import org.springframework.data.repository.CrudRepository;
import ru.tnt.modulegraph.models.ZDV;

/*
 * Интерфейс для работы с таблицей БД ZDV
 * @author radik
 * @version 1.0
 */
public interface ZDVRepositoris extends CrudRepository<ZDV,Long> {
}
