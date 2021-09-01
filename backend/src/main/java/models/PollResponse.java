package models;

import enums.ResultCode;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import java.sql.Timestamp;
import java.util.List;

@Setter
@Getter
@ToString
public class PollResponse {

    @Valid
    private int pollId;

    @Valid
    private PollRequest pollRequest;

    @Valid
    private ResultCode resultCode;
}

