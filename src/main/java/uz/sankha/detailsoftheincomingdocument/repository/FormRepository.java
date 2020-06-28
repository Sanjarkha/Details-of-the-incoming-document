package uz.sankha.detailsoftheincomingdocument.repository;

import org.springframework.data.repository.CrudRepository;
import uz.sankha.detailsoftheincomingdocument.model.FormData;

public interface FormRepository extends CrudRepository <FormData,Long>
{

}
