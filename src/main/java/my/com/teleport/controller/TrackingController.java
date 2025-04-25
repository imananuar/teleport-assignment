package my.com.teleport.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import my.com.teleport.constant.Const;
import my.com.teleport.dao.SuccessRes;
import my.com.teleport.dao.NextTrackingNumberReq;
import my.com.teleport.dao.NextTrackingNumberRes;
import my.com.teleport.util.TrackingUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@Slf4j
@RestController
public class TrackingController {

    @GetMapping("/next-tracking-number/{customerSlug}/")
    public ResponseEntity<SuccessRes> getTrackingNumber(
            @Valid NextTrackingNumberReq req,
            @PathVariable String customerSlug,
            HttpServletRequest request
            ) {

        log.info("API Invoked!");
        log.info(request.getRequestURL().toString());
        log.info(req.toString());

        String tracking_number = TrackingUtil.generateTrackingId("TP", req.origin_country_id, req.destination_country_id);
        NextTrackingNumberRes resData = new NextTrackingNumberRes(tracking_number, Instant.now().toString());
        SuccessRes successRes = new SuccessRes(Const.SUCCESS_MSG, resData.toMap());
        return ResponseEntity.ok(successRes);
    }
}
