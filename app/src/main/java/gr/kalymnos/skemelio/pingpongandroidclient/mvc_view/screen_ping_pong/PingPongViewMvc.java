package gr.kalymnos.skemelio.pingpongandroidclient.mvc_view.screen_ping_pong;

import gr.kalymnos.skemelio.pingpongandroidclient.mvc_view.ToolbaredViewMvc;
import gr.kalymnos.skemelio.pingpongandroidclient.mvc_view.ViewMvc;

public interface PingPongViewMvc extends ToolbaredViewMvc {

    interface OnSendClickListener {
        void onBallClicked();
    }

    void setOnSendClickListener(OnSendClickListener listener);

    void showPing();

    void showPong();

    void animateBall();
}
