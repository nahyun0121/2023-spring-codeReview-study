package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator implements NumberGenerator {

    @Override
    public int make() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
