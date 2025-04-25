package my.com.teleport.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
public class SuccessRes {
    public String message;
    public Map<String, String> data;
}
