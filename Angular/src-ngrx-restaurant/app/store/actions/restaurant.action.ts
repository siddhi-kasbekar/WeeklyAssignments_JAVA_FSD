import { createAction, props } from '@ngrx/store';
import { restaurant } from 'src/app/models/restaurant.model';



export const addRestaurantAction = createAction(
    '[res] Add restaurant',
    props<{ restaurant: restaurant }>()
)




export const removeRestaurantAction = createAction(
    '[res] Remove restaurant',
    props<{ id: number }>()
)

export const updateRestaurantAction = createAction(
    '[res] Update restaurant',
    props<{ id: number,restaurant: restaurant }>()
    
)