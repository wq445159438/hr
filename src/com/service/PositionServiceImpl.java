package com.service;

import com.entity.Position;
import com.mapper.PositionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "positionService")
public class PositionServiceImpl implements PositionService {

    @Resource
    private PositionMapper positionMapper;

    @Override
    public List<Position> findPosition() {
        return positionMapper.findPosition();
    }
}
