package com.liyichen125.dbfinalproject.dao;

import com.liyichen125.dbfinalproject.constant.RecordSituation;
import com.liyichen125.dbfinalproject.dto.RecordRequest;
import com.liyichen125.dbfinalproject.model.Record;

import java.util.List;

public interface RecordDao {
    Integer createRecord(Integer user_id, RecordRequest recordRequest);
    List<Record> getRecord(RecordSituation situation, String search);
}
