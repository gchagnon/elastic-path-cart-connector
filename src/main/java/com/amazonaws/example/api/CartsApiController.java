package com.amazonaws.example.api;

import com.amazonaws.example.model.CreateCartItemRequest;
import com.amazonaws.example.model.CreateCartRequest;
import com.amazonaws.example.model.GetCartItemResponse;
import com.amazonaws.example.model.GetCartResponse;
import com.amazonaws.example.model.ListCartItemsResponse;
import com.amazonaws.example.model.ListCartsResponse;
import com.amazonaws.example.model.UpdateCartItemRequest;
import com.amazonaws.example.model.UpdateCartRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-14T18:22:55.097480834Z[UTC]", comments = "Generator version: 7.9.0")
@Controller
@RequestMapping("${openapi.cartService.base-path:}")
public class CartsApiController implements CartsApi {

    private final NativeWebRequest request;

    @Autowired
    public CartsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
