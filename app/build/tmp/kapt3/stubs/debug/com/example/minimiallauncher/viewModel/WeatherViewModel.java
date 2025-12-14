package com.example.minimiallauncher.viewModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fR.\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lcom/example/minimiallauncher/viewModel/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "<set-?>", "Landroidx/compose/runtime/MutableState;", "Lcom/example/minimiallauncher/model/WeatherResponse;", "weatherData", "getWeatherData", "()Landroidx/compose/runtime/MutableState;", "fetchWeather", "", "lat", "", "lon", "app_debug"})
public final class WeatherViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.MutableState<com.example.minimiallauncher.model.WeatherResponse> weatherData;
    
    public WeatherViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<com.example.minimiallauncher.model.WeatherResponse> getWeatherData() {
        return null;
    }
    
    public final void fetchWeather(double lat, double lon) {
    }
}