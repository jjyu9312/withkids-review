package com.mixx.withkids.domain;

import com.mixx.withkids.AbstractEvent;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
public class MemberUpdated extends MemberReserved {
}
