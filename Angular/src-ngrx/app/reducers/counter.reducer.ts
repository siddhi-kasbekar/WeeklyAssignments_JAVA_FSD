import { createReducer, on } from '@ngrx/store';
import { increment, decrement, reset } from '../actions/counter.actions';

export const initialState = 0;

export const counterReducer = createReducer(
  initialState,
  on(increment, (state:number) => {return state + 1}),
  on(decrement, (state:number) => state - 1),
  on(reset, (state:number) => 0)
);