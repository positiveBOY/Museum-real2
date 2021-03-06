package adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import model.Collection;
import jintong.museum2.R;
import util.SysUtils;

/**
 *
 * 分类藏品的瀑布流图片展示
 *
 * Created by wjc on 2017/3/24.
 */

public class TypeColtAdapter extends BaseAdapter<TypeColtAdapter.TypeColtViewHolder> {

    private int mImageViewWidth;

    public TypeColtAdapter(Context context, List<Object> listDatas, OnViewClickListener onViewClickListener) {
        super(context, listDatas, onViewClickListener);
        mImageViewWidth = (SysUtils.getScreenWidth((Activity) context) - SysUtils.DpToPx(context,  16)) / 2;



    }

    @Override
    public TypeColtViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new TypeColtViewHolder(mInflater.inflate(R.layout.colt_by_type_item,parent,false));
    }

    @Override
    public void onBindViewHolder(TypeColtAdapter.TypeColtViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);


        Collection collection= (Collection) listDatas.get(position);
        collection.getImage1().getFileUrl();
        holder.imageView.setLayoutParams(new FrameLayout.LayoutParams(mImageViewWidth, mImageViewWidth));

        requestManager.load(collection.getImage1().getFileUrl()+ "!/fxfn/500x500"
        )
                .animate(R.anim.image_animate)
                .crossFade()
                .placeholder(R.drawable.loadingpic)
                .into(holder.imageView);


        holder.textView.setText(collection.getColtName());
    }

    @Override
    public int getItemCount() {
        return listDatas.size();
    }


    class TypeColtViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;



        public TypeColtViewHolder(View itemView) {
            super(itemView);
            imageView= (ImageView) itemView.findViewById(R.id.colt_by_type_item_image);
            textView= (TextView) itemView.findViewById(R.id.colt_by_type_item_name);

        }
    }
//    private class DriverViewTarget extends BitmapImageViewTarget {
//
//        public DriverViewTarget(ImageView view, RecyclerView.ViewHolder) {
//            super(view);
//        }
//
//        @Override
//        public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
//
//            int viewWidth = mBinding.viewImgFeed.getWidth();
//            float scale = resource.getWidth() / (viewWidth * 1.0f);
//            int viewHeight = (int) (resource.getHeight() * scale);
//            setCardViewLayoutParams(viewWidth, viewHeight);
//            super.onResourceReady(resource, glideAnimation);
//        }
//    }




}
