package by.barry.workflowlauncher.client;

import by.barry.workflowlauncher.dto.WeatherResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "weatherclient", url = "${weatherclient.url}")
public interface WorkflowWorkerClient {

    @GetMapping("/weather/{city}")
    WeatherResponseDto getWeather(@PathVariable String city);

}
