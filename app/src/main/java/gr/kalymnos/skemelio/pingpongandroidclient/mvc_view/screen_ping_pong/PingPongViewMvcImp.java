package gr.kalymnos.skemelio.pingpongandroidclient.mvc_view.screen_ping_pong;

import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import gr.kalymnos.skemelio.pingpongandroidclient.R;

public class PingPongViewMvcImp implements PingPongViewMvc {

    private View root;
    private ImageView ball;
    private TextView text;
    private FloatingActionButton send;

    public PingPongViewMvcImp(LayoutInflater inflater, ViewGroup parent) {
        initializeViews(inflater, parent);
    }

    private void initializeViews(LayoutInflater inflater, ViewGroup parent) {
        root = inflater.inflate(R.layout.screen_ping_pong, parent, false);
        ball = root.findViewById(R.id.imageview);
        text = root.findViewById(R.id.textView);
        send = root.findViewById(R.id.send_fab);
    }

    @Override
    public void setOnSendClickListener(final OnSendClickListener listener) {
        send.setOnClickListener(view -> {
            if (listener != null)
                listener.onSendClicked();
        });
    }

    @Override
    public void showPing() {
        text.setText("Ping!");
    }

    @Override
    public void showPong() {
        text.setText("Pong!");
    }

    @Override
    public void animateBall() {
        // TODO: Ball animation
    }

    @Override
    public View getRootView() {
        return root;
    }
}
