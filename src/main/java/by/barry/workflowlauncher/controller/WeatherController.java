package by.barry.workflowlauncher.controller;

import by.barry.workflowlauncher.client.WorkflowWorkerClient;
import by.barry.workflowlauncher.dto.WeatherResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WeatherController {

    private final WorkflowWorkerClient workflowWorkerClient;

    @GetMapping("/weather/{city}")
    public WeatherResponseDto getWeather(@PathVariable String city) {
        return workflowWorkerClient.getWeather(city);
    }

}
