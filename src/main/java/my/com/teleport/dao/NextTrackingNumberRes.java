package my.com.teleport.dao;

import lombok.Getter;
import lombok.Setter;
import my.com.teleport.constant.Const;

import java.util.Map;

@Getter
@Setter
public class NextTrackingNumberRes {
    public String tracking_number;
    public String created_at;

    public NextTrackingNumberRes(String tracking_number, String created_at) {
        this.tracking_number = tracking_number;
        this.created_at = created_at;
    }

    public Map<String, String> toMap() {
        return Map.of(
                Const.TRACKING_NUMBER, this.tracking_number,
                Const.CREATED_AT, this.created_at
        );
    }
}
