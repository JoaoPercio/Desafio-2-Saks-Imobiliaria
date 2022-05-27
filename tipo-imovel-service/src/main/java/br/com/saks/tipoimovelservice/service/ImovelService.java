package br.com.saks.tipoimovelservice.service;

import br.com.saks.tipoimovelservice.model.Imovel;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
/**
 *
 * @author jrper
 */
@FeignClient(name="imovel-service")
public interface ImovelService {
    
    @GetMapping(value = "/imovel/tipo/{idTipoImovel}")
    List<Imovel> listarPeloIdTipoImovel(@PathVariable("idTipoImovel") Long idTipoImovel);
}