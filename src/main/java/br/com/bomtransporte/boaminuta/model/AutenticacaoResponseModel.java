package br.com.bomtransporte.boaminuta.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AutenticacaoResponseModel {

    private SessionModel sessionProfile;
    private String sessionToken;
    private String refreshToken;
}