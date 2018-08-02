package com.huanghh.diary.mvp.contract;

import com.huanghh.diary.mvp.model.WeeItem;
import com.huanghh.diary.mvp.presenter.BasePresenter;
import com.huanghh.diary.mvp.view.BaseView;

public interface WeeInputContract {
    interface View extends BaseView {
        void saveFinish();
    }

    interface Presenter extends BasePresenter {
        void saveToLocal(WeeItem wee, int type);
    }
}
