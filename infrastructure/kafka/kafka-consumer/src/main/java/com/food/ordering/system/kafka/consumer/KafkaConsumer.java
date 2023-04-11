package com.food.ordering.system.kafka.consumer;

import org.apache.avro.specific.SpecificRecord;

import java.util.List;

public interface KafkaConsumer<T extends SpecificRecord> {
    void receive(List<T> message, List<Long> keys, List<Integer> partitions, List<Long> offsets);
}
