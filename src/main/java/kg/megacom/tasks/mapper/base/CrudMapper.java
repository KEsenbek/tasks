package kg.megacom.tasks.mapper.base;

public interface CrudMapper <E,D> {
    E toDto (D e);
    D toEntity (D d);
}
