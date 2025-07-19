package com.nic.vat.registration.repository;

import com.nic.vat.registration.model.DealerBankInfo;
import com.nic.vat.registration.model.DealerBankInfoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface DealerBankInfoRepository extends JpaRepository<DealerBankInfo, DealerBankInfoId> {

    // Existing method to find all bank info by ackNo
    List<DealerBankInfo> findByAckNo(BigDecimal ackNo);

    // ✅ Newly added method to get the first bank info by ackNo (used in service)
    DealerBankInfo findFirstByAckNo(BigDecimal ackNo);
}
