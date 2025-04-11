import com.bloxbean.cardano.client.exception.CborDeserializationException;
import com.bloxbean.cardano.client.plutus.spec.ConstrPlutusData;
import com.bloxbean.cardano.client.plutus.spec.PlutusData;
import com.bloxbean.cardano.client.util.HexUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class DatumDeserializationTest {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Test
    public void deserDatum1() throws CborDeserializationException, JsonProcessingException {
        var datum = "d8799fd8799f1a02faf0801a04ce5a1dffd8799fd8799f581c2917f6d90480427dc141f2a994f01a0778ed559cfc9d0f590629ae17ffd8799fd8799fd8799f581cb7d2352a2a8a6661df9657f3fbe93a9e3ca77f9c03ec99eef2025f50ffffffffd8799f191388190c4bff1b0000019623a8ef20581c04ea363a127872366ef2d3186325a25a5cee8826ff8a79dc7c8fa671ff";
        var data = PlutusData.deserialize(HexUtil.decodeHexString(datum));
        log.info("data: {}", OBJECT_MAPPER.writeValueAsString(data));

    }
    @Test
    public void deserDatum2() throws CborDeserializationException, JsonProcessingException {
        var datum = "d8799fd87c9f1b0000000107075abbffd8799fd8799f581cda5abd13ee5452d3805e63b352ad38f5a2854c3ba32d855dcd77f83fffd8799fd8799fd8799f581ca0b4324b7f8b917b1e5f52facfb5d570a1a6c40cd8c4e7e6016f96eeffffffffd8799f1a001e84801a0011a241ff1b000001960d3f56e8581c04ea363a127872366ef2d3186325a25a5cee8826ff8a79dc7c8fa671ff";
        var data = PlutusData.deserialize(HexUtil.decodeHexString(datum));
        log.info("data: {}", OBJECT_MAPPER.writeValueAsString(data));

    }



}
