
package mall.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="delivery", url="http://localhost:8082")
public interface DeliveryService {

    @RequestMapping(method= RequestMethod.GET, path="/cancelDelivery")
    public void cancelDelivery(@RequestBody Delivery delivery);

}